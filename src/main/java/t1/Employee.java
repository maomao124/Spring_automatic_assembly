package t1;

/**
 * Project name(项目名称)：Spring自动装配
 * Package(包名): t1
 * Class(类名): Employee
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 20:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Employee
{
    //员工编号
    private String empNo;
    //员工姓名
    private String empName;
    //部门信息
    private Dept dept;

    public Employee()
    {
        System.out.println("正在执行 Employee 的无参构造方法>>>>");
    }

    public Employee(String empNo, String empName, Dept dept)
    {
        System.out.println("正在执行 Employee 的有参构造方法>>>>");
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    public void setEmpNo(String empNo)
    {
        System.out.println("正在执行 Employee 的 setEmpNo 方法>>>>");
        this.empNo = empNo;
    }

    public void setEmpName(String empName)
    {
        System.out.println("正在执行 Employee 的 setEmpName 方法>>>>");
        this.empName = empName;
    }

    public void setDept(Dept dept)
    {
        System.out.println("正在执行 Employee 的 setDept 方法>>>>");
        this.dept = dept;
    }

    public Dept getDept()
    {
        return dept;
    }

    public String getEmpNo()
    {
        return empNo;
    }

    public String getEmpName()
    {
        return empName;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("empNo：").append(empNo).append('\n');
        stringbuilder.append("empName：").append(empName).append('\n');
        stringbuilder.append("dept：").append(dept).append('\n');
        return stringbuilder.toString();
    }
}
