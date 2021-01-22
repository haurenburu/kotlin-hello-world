import java.time.LocalDate
import java.time.temporal.ChronoUnit

open class Pessoa(name: String, height: Double) {
    private var name: String = name
    private var height: Double = height
    private var age: Long = 0
    private var birth: LocalDate = LocalDate.now();



    constructor(name: String, height: Double, birth: LocalDate) : this(name, height) {
        this.name = name;
        this.height = height;
        this.birth = birth;
        this.setAge();
    }

    private fun setAge() {
        this.age = ChronoUnit.YEARS.between(
            this.birth,
            LocalDate.now()
        )
    }

    fun getName(): String {
        return this.name;
    }

    override fun toString(): String {
        return "${this.name}(${this.birth}, ${this.height})";
    }
}