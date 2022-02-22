package t1;

/**
 * Project name(项目名称)：Spring自动装配
 * Package(包名): t1
 * Class(类名): Dept
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 20:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Dept
{
    //部门编号
    private String deptNo;
    //部门名称
    private String deptName;

    public Dept()
    {
        System.out.println("正在执行 Dept 的无参构造方法>>>>");
    }

    public Dept(String deptNo, String deptName)
    {
        System.out.println("正在执行 Dept 的有参构造方法>>>>");
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public void setDeptNo(String deptNo)
    {
        System.out.println("正在执行 Dept 的 setDeptNo 方法>>>>");
        this.deptNo = deptNo;
    }

    public void setDeptName(String deptName)
    {
        System.out.println("正在执行 Dept 的 setDeptName 方法>>>>");
        this.deptName = deptName;
    }

    public String getDeptNo()
    {
        return deptNo;
    }

    public String getDeptName()
    {
        return deptName;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("deptNo：").append(deptNo).append('\n');
        stringbuilder.append("deptName：").append(deptName).append('\n');
        return stringbuilder.toString();
    }
}
