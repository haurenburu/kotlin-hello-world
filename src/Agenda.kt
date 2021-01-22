class Agenda() {
    var pessoas= Array(10) { Pessoa("", 0.0) }
    var quantP = 0;

    fun armazenaPessoa(pessoa: Pessoa) {
        if(quantP < 10) {
            pessoas[quantP++] = pessoa;
        } else {
            println("Ja tem gente demais!")
        }
    }
    fun removePessoa(nome: String): Boolean {
        for (i in 0 until quantP) {
            if(pessoas[i].getName() == nome) {
                pessoas[i] = pessoas[--quantP];
                return true;
            }
        }
        println("Nao achei essa pessoa");
        return false;
    }

    fun buscaPessoa(nome: String): Boolean {
        for(i in 0 until quantP) {
            if (pessoas[i].getName() == nome) {
                println(pessoas[i])
                return true;
            }
        }
        return false;
    }
    fun printAgenda() {
        for(i in 0 until quantP) {
            println(pessoas[i]);
        }
    }
}