/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

public class Conta {

    private int idConta;
    private int agencia;
    private int contaCorrente;
    private int idTipoConta;
    private int idGerente;
    private int idTransacao;
    private int idCliente;
    private int rendimentoDiario;     
    private double saldo;
    private String localCompra;
    private double valorTotalCompra;
    private int idTipoTransacao;
    

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public int getIdTipoConta() {
        return idTipoConta;
    }

    public void setIdTipoConta(int idTipoConta) {
        this.idTipoConta = idTipoConta;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getRendimentoDiario() {
        return rendimentoDiario;
    }

    public void setRendimentoDiario(int rendimentoDiario) {
        this.rendimentoDiario = rendimentoDiario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public int getIdTipoTransacao() {
        return idTipoTransacao;
    }

    public void setLocalCompra(String localCompra) {
        this.localCompra = localCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public void setIdTipoTransacao(int idTipoTransacao) {
        this.idTipoTransacao = idTipoTransacao;
    }
}
