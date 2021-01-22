fun main() {
    val agenda = Agenda();
    val p0 = Pessoa("antonio0", height = 1.65);
    val p1 = Pessoa("antonio1", height = 1.65);
    val p2 = Pessoa("antonio2", height = 1.65);
    val p3 = Pessoa("antonio3", height = 1.65);
    val p4 = Pessoa("antonio4", height = 1.65);
    val p5 = Pessoa("antonio5", height = 1.65);
    val p6 = Pessoa("antonio6", height = 1.65);
    val p7 = Pessoa("antonio7", height = 1.65);
    val p8 = Pessoa("antonio8", height = 1.65);
    val p9 = Pessoa("antonio9", height = 1.65);

    agenda.armazenaPessoa(p0);
    agenda.armazenaPessoa(p1);
    agenda.armazenaPessoa(p2);
    agenda.armazenaPessoa(p3);
    agenda.armazenaPessoa(p4);
    agenda.armazenaPessoa(p5);
    agenda.armazenaPessoa(p6);
    agenda.armazenaPessoa(p7);
    agenda.armazenaPessoa(p8);
    agenda.armazenaPessoa(p9);

    agenda.printAgenda();
    agenda.removePessoa("antonio5");
    agenda.printAgenda();


//    agenda.printAgenda();
//    agenda.buscaPessoa("antonio3");

//    agenda.armazenaPessoa(p5);

}