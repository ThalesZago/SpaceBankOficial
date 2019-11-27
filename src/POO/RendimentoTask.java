/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import DAO.ContaDAO;
import java.util.List;
import java.util.TimerTask;


/**
 *
 * @author ellen.salicani
 */
public class RendimentoTask extends TimerTask{

        IRendimentoTask listener;

        public RendimentoTask(IRendimentoTask listener) {
                this.listener = listener;
        }

        private ContaDAO contaDAO = new ContaDAO();

        @Override
        public void run() {
                try {
                    System.out.println("rendimento task");
                    List<Conta> contas = contaDAO.listarTodos();
                    System.out.println("conta size: " + contas.size());
                     for(Conta conta : contas) {
                        float saldo = conta.getSaldo();
                        conta.setSaldo(saldo + ((saldo * conta.getRendimentoDiario()) / 100 ));
                        System.out.println("conta dao saldo: " + conta.getSaldo());
                         System.out.println("conta rendimento diario" + conta.getRendimentoDiario());
                        contaDAO.alterar(conta);
                     }
                     listener.onRendimento();
                }catch (Exception e) {
                        e.printStackTrace();
                }
            }
}
