import java.time.LocalDate;
import java.util.Objects;

public class EmployeePayrollData {
    public int id;
    public String name;
    public double salary;
    public double basicPay;
    public LocalDate startDate;

    public EmployeePayrollData(int id, String name, double salary, double basicPay , LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.basicPay = basicPay;
        this.startDate = startDate;
    }
    @Override
    public String toString()
    {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", Basic Pay='" + basicPay + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeePayrollData that = (EmployeePayrollData) o;
        return id == that.id && Double.compare(that.salary, salary) == 0 && Objects.equals(name, that.name);
    }
}