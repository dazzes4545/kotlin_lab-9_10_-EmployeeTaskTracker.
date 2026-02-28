fun main() {
    /*
    //zad2
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
    */

    //zad3
    val task1 = Task("Сдать отчет", "Подготовить отчет за месяц", Priority.high)
    val task2 = Task("Сдать отчет", "Подготовить отчет за месяц", Priority.high)
    val task3 = Task("Проверить почту", "Ответить на письма", Priority.low)
    println("task1 == task2: ${task1 == task2}")
    println("task1 == task3: ${task1 == task3}")
    println("hashCode task1: ${task1.hashCode()}")
    println("hashCode task2: ${task2.hashCode()}")
    println("hashCode task3: ${task3.hashCode()}")
    println("task1.toString(): $task1")
    println("task3.toString(): $task3")
    val task1Copy = task1.copy(priority = Priority.low)
    println("Ориджинал: $task1")
    println("Копия с др. приоритетом: $task1Copy")
}