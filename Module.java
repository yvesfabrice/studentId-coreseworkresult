import java.util.*;

class Module
{
    private ArrayList<Student> people = new ArrayList<>();

    /**
     * Add a student
     * @param student A students details
     */
    public void add( Student student )
    {
        people.add( student );
    }

    /**
     * Return the number of students who pass this module
     * @return Number of students who have passed
     */
    public int pass()
    {
        // Fill in code for the method
        int count=0;
        for (int i = 0; i < people.size(); i++ )
        {
            if (people.get(i).getMark() >= 40)
            {

                count ++;
            }

        }
        return count;
    }

    /**
     * Return the number of students who fail this module
     * @return Number of students who have failed
     */
    public int fail()
    {
        // Fill in code for the method

        // Fill in code for the method
        int count=0;
        for (int i = 0; i < people.size(); i++ )
        {
            if (people.get(i).getMark() < 40)
            {

                count ++;
            }

        }
        return count;

    }

    /**
     * Return the name of the student with the highest mark
     *  There will only be 1 students who has the highest mark
     * @return Name of the student with the highest mark.
     */
    public String top()
    {int topMark = 0; 
        String Name =""; 
        // Fill in code for the method
        for (int i=0; i < people.size(); i++ ){

            if (people.get(i).getMark() > topMark)
            {
                Name = people.get(i).getName();
            }

            
        }
        //to changer a interger to a string 
        return Name;
    }

    /**
     * Return the average mark of students on the module
     * @return The average mark
     */

    public double average()
    {

        // Fill in code for the method
        int total = 0;
        for (int i=0; i < people.size(); i++ )
        {

            total = total + people.get(i).getMark();

        }
        double average= total/people.size();

        return average ;

    }

}
