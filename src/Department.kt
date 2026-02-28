abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
    abstract fun generateReport(): String
}

class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель $departmentName: Писать чистый код")
    }

    override fun generateReport(): String {
        return """
            Отдел: $departmentName
            Цель: Писать чистый код
            Количество сотрудников: Не указано
        """
    }
}

abstract class TestingDepartment : Department() {
    override val departmentName: String = "Отдел тестирования"

    override fun printDepartmentGoal() {
        println("Цель $departmentName: Находить все баги")
    }
}