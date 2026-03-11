# Faculty for Courses With List of Students and Support Staff
Instructions:
The main file is FinalProject.java. Compile and run here to show the output of the program.

Designed a class named Person in the Person.java file that has two subclasses named Student and Employee. A person has a name, address, phone number, and email address.

Created an employee subclass in the Employee.java file. An employee has an office, salary, and date hired (Use LocalDateLinks to an external site.Links to an external site. class provided by Java SE.).

Made Faculty located in Faculty.java and Staff located in Staff.java subclasses of Employee.

Created a faculty subclass in the faculty.java file. A faculty member teaches one or more courses from the pre-assigned list of courses [CSC100, CSC200, CSC330, CSC340, CSC325, CSC335].

A staff member has a title such as [Education Coordinator, Registrar, Program Manager, Assistant, Support Staff]. 

A default Staff object should be assigned a title of 'Support Staff' A default constructor was used to create a staff object.

Created a student subclass in the Student.java file. A student has a class status (freshman, sophomore, junior, or senior). Defined the status as a constant.

Overrode the toString method in each class to display the class name and the person’s name.

Wrote a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods. 

Created a list of employees that contains a total of 10 employees out of which 6 are Faculty and the remaining 4 are Staff members. 

Each Faculty should be given a list of courses to teach (at least 2 or more).

Each staff member should have a title assigned. No 2 Staff members can have the same title and at least one staff member should have a default title [Support Staff].

Created an interface called Course each student should belong to at least 3 courses and each course will have one and only one course assigned to them. 

Print the list of courses and for each course print the assigned students (their name, address, email, phone number), print the name of the faculty teaching the course and faculty details. 

Assign all staff members to each course and list their details as well.

