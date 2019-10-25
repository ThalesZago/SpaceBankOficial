
package GUI.TM;

import POO.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gregory.oliveira
 */
public class ClienteTableModel extends AbstractTableModel {

    private String colunas[] = {"Nome", "CPF/CNPJ", "Idade", "Pessoa física?"};
    private List<Cliente> dados;
    
    @Override
    public int getRowCount() {
       if(dados == null){
           return 0;
       }
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Cliente cliente = dados.get(l);
        switch(c){
            case 0:
                return cliente.getNomeCompleto();
            case 1:
                return cliente.getCpfCnpj();
            case 2:
                return cliente.getIdade();
            case 3:
                return cliente.isPessoaFisica() ? "Sim" : "Não";
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente");
        }
    }
    
    @Override
    public String getColumnName(int c){
        return colunas[c];
    }
    
    @Override
    public boolean isCellEditable(int l, int c){
        return false;
    }
    
    public void setDados(List<Cliente> dados){
        this.dados = dados;
        fireTableDataChanged();
    }
    
    public Cliente getRowValue(int l){
        return dados.get(l);
    }
}
