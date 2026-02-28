abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель $departmentName: Писать чистый код")
    }
}

class TestingDepartment : Department() {
    override val departmentName: String = "Отдел тестирования"

    override fun printDepartmentGoal() {
        println("Цель $departmentName: Находить все баги")
    }
}