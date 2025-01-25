package problemstatements.employeemanagementsystem;

// HRDepartment class implementing Department interface
class HRDepartment implements Department {
    private String department;

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}