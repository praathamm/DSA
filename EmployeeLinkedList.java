
import java.util.Scanner;

class employee {

    String name;
    int ID;
    String gender;
    int salary;
    employee next;

    employee(String a, int b, String c, int d) {
        name = a;
        ID = b;
        gender = c;
        salary = d;
    }

    employee(int a) {
        ID = a;
    }

}

public class EmployeeLinkedList {

    employee root;

    void create_list() {
        root = null;//indicates list is not created till now
    }

    void insert_right(employee a) {
    employee m = root;
    if (root == null) {
        root = a;
    } else {
        while (m.next!= null) {
            if (m.ID == a.ID) {
                System.out.println("Employee already exists");
                return;
            }
            m = m.next;
        }
        m.next = a;
    }
}

    void printemp() {
        if (root == null) {
            System.out.println("List is empty");

        }
        employee t;
        t = root;
        while (t != null) {   //use t instead of t.next while comparing because t.next wont print the last element 
            System.out.print(t.name + " " + t.ID + "  " + t.gender + " " + t.salary);
            t = t.next;

        }
    }





    
    void search(employee a) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            employee t = root;
            while (t != null && t.ID != a.ID) {
                t = t.next;
            }
            if (t == null) {
                System.out.println("Not found in list");
            } else {
                System.out.println(a.name + " was found!");
                
            }
        }
    }


    void delete(employee emp) {
        if (root == null)//root is assigned not created
            System.out.println("Empty List");
        else
        {
            employee t = root;//1
            employee t2=root;//1
            while (t != null && t.ID != emp.ID)//2
            {
                t2=t;
                t = t.next;
            }
            if(t==null)//not found
                System.out.println(emp.ID+" not found in list");
            else //found
            {
                System.out.println(emp.ID+" found in list");
                if(t==root)//case 1:
                    root=root.next;
                else if(t.next==null)//case 2
                    t2.next=null;
                else//case 3
                    t2.next=t.next;
                System.out.println("Deleted:"+emp.ID);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();
        Scanner sc = new Scanner(System.in);
        list.create_list();

        int choice;
        do {

            System.out.println("\n1.Add Employee  \n2.Search Employee\n3.Show all employees \n4.Delete Employee  \n0.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Employee Name:");
                    String a = sc.next();
                    System.out.println("Employee ID");
                    int b = sc.nextInt();
                    System.out.println("Enter Gender");
                    String c = sc.next();
                    System.out.println("Enter Salary");
                    int d = sc.nextInt();
                    employee e = new employee(a, b, c, d);
                    list.insert_right(e);

                    break;

                case 2:
                    System.out.println("Enter ID to search: ");
                    int id = sc.nextInt();
                    employee emp = new employee(id);
                    list.search(emp);
                    break;

                case 3:
                    list.printemp();
                    break;

                    case 4:
                    System.out.println("Enter ID to delete: ");
                    int eid = sc.nextInt();
                    employee emp2 = new employee(eid);
                    list.delete(emp2);
                    
                case 0:
                    System.out.println("Thanks for using the code...");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }

        } while (choice != 0);//condtion exit choice in inverted to option
    }

}
