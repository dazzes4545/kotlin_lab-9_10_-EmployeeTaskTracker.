fun main() {
    val employee = Employee()

    employee.setFullName("Ибрагимов Ибрагим Ибрагимович")
    employee.setPosition("Разраб")

    println("Тест")
    employee.setSalary(-1000)
    employee.setSalary(50000)
    println("ЗП: ${employee.getSalary()}")

    employee.setYearsOfExperience(60)
    employee.setYearsOfExperience(-5)
    employee.setYearsOfExperience(10)
    println("Опыт работы: ${employee.getYearsOfExperience()}")
}