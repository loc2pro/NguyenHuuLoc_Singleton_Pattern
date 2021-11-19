package com.company.builder;

public class Student {

    //required parameters
    private long id;
    private String name;
    private String className;
    private int age;
    private String gender;

    //optional parameters
    private String address;
    private String fatherName;
    private String motherName;
    private String nationality;
    private String religion;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String address(){
        return address;
    }
    public String fatherName(){
        return fatherName;
    }
    public String motherName(){
        return motherName;
    }
    public String nationality(){
        return nationality;
    }
    public String religion(){
        return religion;
    }

    private Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.className = builder.className;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.nationality = builder.nationality;
        this.religion = builder.religion;
    }

    //Builder Class
    public static class StudentBuilder{
        //required parameters
        private long id;
        private String name;
        private String className;
        private int age;
        private String gender;

        //optional parameters
        private String address;
        private String fatherName;
        private String motherName;
        private String nationality;
        private String religion;

        public StudentBuilder(long id, String name, String className, int age, String gender) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.age = age;
            this.gender = gender;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }
}
