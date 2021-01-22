import java.time.LocalDate

fun main() {
    val birth = LocalDate.of(1500,1,19);
    val pessoa = Pessoa("antonio", 50.0, birth)

    println(pessoa.toString());
}