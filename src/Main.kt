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

    /*
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
    */

    /*
    //zad4
    val devDept = DevelopmentDepartment()
    val testDept = TestingDepartment()
    devDept.printDepartmentGoal()
    testDept.printDepartmentGoal()
    */


    //zad5
    val employee = Employee().apply {
        setFullName("Петров Петр Петрович")
        setPosition("Senior Developer")
        setSalary(150000)
        setYearsOfExperience(8)
    }
    val reports: List<ReportGenerator> = listOf(
        employee,
        DevelopmentDepartment()
    ) as List<ReportGenerator>
    reports.forEachIndexed { index, generator ->
        println("\nОтчет #${index + 1}:")
        println(generator.generateReport())
    }

    //zad6
    val employee = Employee().apply {       // Создание сотрудника
        setFullName("Сидоров Сидор Сидорович")
        setPosition("Team Lead")
        setSalary(200000)
        setYearsOfExperience(12)
    }

    val devDept = DevelopmentDepartment()       // Создание отдела

    val task1 = Task(       // Создание отдела

        title = "Рефакторинг кода",
        description = "Переписать устаревшие модули",
        priority = Priority.high
    )

    val task2 = Task(
        title = "Документация",
        description = "Обновить техническую документацию",
        priority = Priority.medium
    )

    val task3 = Task(
        title = "Code review",
        description = "Проверить пул-реквесты",
        priority = Priority.high
    )

    println("Назначение задач")     // Моделирование процесса
    employee.assignTask(task1)
    employee.assignTask(task2)


    task1.isCompleted = true    // Завершаем первую задачу
    println("\nЗадача \"${task1.title}\" выполнена!")

    employee.assignTask(task3)    // Назначаем новую задачу


    // Сводный отчет
    println("\nСВОДНЫЙ ОТЧЕТ")
    println(employee.generateReport())
    println("\nОТЧЕТ ОТДЕЛА")
    println(devDept.generateReport())
}

