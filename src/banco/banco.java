package banco;

void depositar(double valor);
double getSaldo();
}

//ContaCorrente.java - implementação da conta corrente
public class ContaCorrente implements ContaBancaria {
private double saldo;

public void sacar(double valor) {
    saldo -= valor;
}

public void depositar(double valor) {
    saldo += valor;
}

public double getSaldo() {
    return saldo;
}
}

//ContaSalario.java - implementação da conta salário
public class ContaSalario implements ContaBancaria {
private double saldo;

public void sacar(double valor) {
    saldo -= valor;
}

public void depositar(double valor) {
    saldo += valor;
}

public double getSaldo() {
    return saldo;
}
}

//ContaPoupanca.java - implementação da conta poupança
public class ContaPoupanca implements ContaBancaria {
private double saldo;

public void sacar(double valor) {
    saldo -= valor;
}

public void depositar(double valor) {
    saldo += valor;
}

public double getSaldo() {
    return saldo;
}
}

//ContaInvestimento.java - implementação da conta investimento
public class ContaInvestimento implements ContaBancaria {
private double saldo;

public void sacar(double valor) {
    saldo -= valor;
}

public void depositar(double valor) {
    saldo += valor;
}

public double getSaldo() {
    return saldo;
}
}

//SaldoInsuficienteAspect.java - aspecto para verificar saldo insuficiente
public aspect SaldoInsuficienteAspect {
pointcut sac

}
