class AgendaList {
    var pessoas: ArrayList<Pessoa> = arrayListOf();

    fun armazenaPessoa(p: Pessoa) {
        if(pessoas.size < 10) {
            this.pessoas.add(p);
        } else {
            println("Ja tem gente demais!")
        }
    }

    fun removePessoa(nome: String) {

        if (!this.buscaPessoa(nome)) return

        var pos = 0;

        pessoas.forEachIndexed { index, pessoa ->
            if (pessoa.getName() == nome) {
                pos = index;
            }
        }
        pessoas.removeAt(pos);
    }

    fun buscaPessoa(nome: String): Boolean {
        pessoas.forEach{
            if(it.getName() == nome) {
                println(it)
                return true;
            }
        }
        println("Ninguem com esse nome");
        return false;
    }

    fun printAgenda() {
        pessoas.forEach{
            println(it)
        }
    }

    fun printPessoa(index: Int) {
        println(pessoas[index]);
    }
}