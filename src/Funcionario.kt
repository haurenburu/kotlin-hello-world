class Funcionario(name: String, height: Double, salario: Double) : Pessoa(name, height){
    var funcSalario = salario;


    fun getSalario(): Double {
        return this.funcSalario;
    }

    override fun toString(): String {
        return "${getName()} (R$${this.getSalario()})"
    }
}