//import java.util.Scanner;
//
///*
// * Create the Encrypter class here.
// */
//
//class Encrypter{
//    static Validator v = new Validator();
//    public static String getEncryptedName(String name){
//        if(v.validate(name)){
//            StringBuilder s1 = new StringBuilder(name.toLowerCase());
//            return s1.reverse().toString();
//        } else {
//            throw new IllegalArgumentException("Try again with valid name");
//        }
//    }
//}
//
//
//
//class Validator {
//    public boolean validate(String name) {
//        for (int i = 0; i < name.length(); i++) {
//            char ch = name.charAt(i);
//
//            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
//
//public class Solution {
//    private static final Scanner INPUT_READER = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String name = INPUT_READER.nextLine();
//
//        try {
//            System.out.println(Encrypter.getEncryptedName(name));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
//
//
//
//
//-------------------------------------------------------------------------
//
//        import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//        import java.net.*;
//        import com.google.gson.*;
//
//public class Solution {
//    /*
//     * Complete the function below.
//     * https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=[topic]
//     */
//
//    static int getTopicCount(String topic) {
//        int result = 0;
//        String response;
//        try {
//            URL obj = new URL("https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="+topic);
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//            con.setRequestMethod("GET");
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            while ((response = in.readLine()) != null) {
//                JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
//                JsonObject data = convertedObject.get("parse").getAsJsonObject();//getAsJsonArray("parse");
//                String input = data.get("text").toString();
//                System.out.println("input is :::::" + input);
//
//                result = input.split(topic).length -1;
//
//            }
//            in.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return 0;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) throws IOException{
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        int res;
//        String _topic;
//        try {
//            _topic = in.nextLine();
//        } catch (Exception e) {
//            _topic = null;
//        }
//
//        try {
//            res = getTopicCount(_topic);
//        } catch (Exception e) {
//            res = 0;
//        }
//        bw.write(String.valueOf(res));
//        bw.newLine();
//
//        bw.close();
//    }
//}
//
//--------------------------------------------------------------------------------
//
//        import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//        import java.util.Scanner;
//
//class Mobile{
//    private boolean touchScreenAvailable;
//    private boolean enabled5G;
//    private int ram;
//    private int cameraPixel;
//    private String brandName;
//    private String deviceName;
//
//    Mobile(MobileBuilder builder){
//        this.brandName = builder.brandName;
//        this.deviceName = builder.deviceName;
//        this.touchScreenAvailable = builder.touchScreenAvailable;
//        this.enabled5G = builder.enabled5G;
//        this.ram = builder.ram;
//        this.cameraPixel = builder.cameraPixel;
//    }
//    public boolean isTouchScreenAvailable() {
//        return touchScreenAvailable;
//    }
//
//    public boolean isEnabled5G() {
//        return enabled5G;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public int getCameraPixel() {
//        return cameraPixel;
//    }
//
//    public String getBrandName() {
//        return brandName;
//    }
//
//    public String getDeviceName() {
//        return deviceName;
//    }
//
//    void printDetails(){
//        StringBuilder s1 = new StringBuilder();
//        s1.append("Mobile ");
//        s1.append(deviceName);
//        s1.append(" of brand ");
//        s1.append(brandName);
//        s1.append(" with following features : ");
//        s1.append("touch screen enabled ");
//        s1.append(touchScreenAvailable+",");
//        s1.append(" 5G enabled ");
//        s1.append(enabled5G+",");
//        s1.append(" ram "+ram+",");
//        s1.append(" camera pixel "+cameraPixel+".");
//        System.out.println(s1.toString());
//    }
//
//
//    static class MobileBuilder{
//        private boolean touchScreenAvailable;
//        private boolean enabled5G;
//        private int ram;
//        private int cameraPixel;
//        private String brandName;
//        private String deviceName;
//
//        MobileBuilder(String brandName, String deviceName){
//            this.brandName = brandName;
//            this.deviceName = deviceName;
//        }
//
//        public MobileBuilder setTouchScreenAvailable(boolean touchScreenAvailable){
//            this.touchScreenAvailable = touchScreenAvailable;
//            return this;
//        }
//        public MobileBuilder setEnabled5G(boolean enabled5G){
//            this.enabled5G = enabled5G;
//            return this;
//        }
//        public MobileBuilder setRam(int ram){
//            this.ram = ram;
//            return this;
//        }
//        public MobileBuilder setCameraPixel(int cameraPixel){
//            this.cameraPixel = cameraPixel;
//            return this;
//        }
//        public Mobile build(){
//            return new Mobile(this);
//        }
//    }
//}
//
//public class Solution {
//    public static void main(String args[] ) throws Exception {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Scanner sc = new Scanner(System.in);
//        String sub = sc.nextLine();
//        int n = Integer.parseInt(sub);
//        for(int i=0;i<n;i++){
//            String[] temp = sc.nextLine().split(" ");
//            Mobile mobile = new Mobile.MobileBuilder(temp[0], temp[1])
//                    .setTouchScreenAvailable(Boolean.parseBoolean(temp[2]))
//                    .setEnabled5G(Boolean.parseBoolean(temp[3]))
//                    .setRam(Integer.parseInt(temp[4]))
//                    .setCameraPixel(Integer.parseInt(temp[5])).build();
//            mobile.printDetails();
//        }
//    }
//}
//
//
//------------------------------------------------------------------------
//
//        import java.util.Collections;
//        import java.util.Comparator;
//        import java.util.List;
//        import java.util.Scanner;
//
//
//        import java.util.ArrayList;
///*
// * Create the RegistrationPortal class here.
// */
//class RegistrationPortal{
//    List<Student> registeredStudents;
//    private static RegistrationPortal instace;
//    //  private static Object obj = new Object();
//
//    RegistrationPortal(){
//        registeredStudents = new ArrayList<>();
//    }
//
//    public static RegistrationPortal getRegistrationPortal(){
//        synchronized(RegistrationPortal.class){
//            if(instace == null){
//                instace = new RegistrationPortal();
//            }
//            return instace;
//        }
//    }
//
//    void register(Student student){
//        synchronized(RegistrationPortal.class){
//            registeredStudents.add(student);
//        }
//    }
//
//    List<Student> getRegisteredStudents(){
//        return registeredStudents;
//    }
//
//
//}
//
//class RegistrationHelper {
//    private final RegistrationPortal registrationPortal;
//
//    public RegistrationHelper(RegistrationPortal registrationPortal) {
//        this.registrationPortal = registrationPortal;
//    }
//
//    public void register(Student student) {
//        if (this.registrationPortal != null) {
//            this.registrationPortal.register(student);
//        }
//    }
//}
//
//class Student {
//    private final String id;
//    private final String name;
//
//    public Student(String id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public String getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//}
//
//class RegistrationRunnable implements Runnable {
//    private final RegistrationPortal registration;
//    private final int studentsCount;
//    private final String studentsIdPrefix;
//
//    public RegistrationRunnable(RegistrationPortal registration, int studentsCount, String studentsIdPrefix) {
//        this.registration = registration;
//        this.studentsCount = studentsCount;
//        this.studentsIdPrefix = studentsIdPrefix;
//    }
//
//    @Override
//    public void run() {
//        RegistrationHelper registrationHelper = new RegistrationHelper(registration);
//
//        for (int i = 1; i <= studentsCount; i++) {
//            String studentId = "id-" + studentsIdPrefix + "-" + i;
//            String studentName = "name-" + i;
//
//            Student student = new Student(studentId, studentName);
//
//            registrationHelper.register(student);
//        }
//    }
//}
//
//public class Solution {
//    private static final Scanner SCANNER = new Scanner(System.in);
//
//    public static void main(String[] args) throws InterruptedException {
//        int threadsCount = Integer.parseInt(SCANNER.nextLine());
//        Thread[] threads = new Thread[threadsCount];
//
//        int expectedRegisteredStudentsCount = 0;
//        for (int i = 0; i < threadsCount; i++) {
//            RegistrationPortal registrationAccess = RegistrationPortal.getRegistrationPortal();
//
//            int studentsCount = Integer.parseInt(SCANNER.nextLine());
//            expectedRegisteredStudentsCount += studentsCount;
//
//            threads[i] = new Thread(new RegistrationRunnable(registrationAccess, studentsCount, String.valueOf(i + 1)));
//        }
//
//        for (int i = 0; i < threadsCount; i++) {
//            threads[i].start();
//        }
//
//        for (int i = 0; i < threadsCount; i++) {
//            threads[i].join();
//        }
//
//        RegistrationPortal registrationAccess = RegistrationPortal.getRegistrationPortal();
//        List<Student> registeredStudents = registrationAccess.getRegisteredStudents();
//
//        if (registeredStudents.size() != expectedRegisteredStudentsCount) {
//            System.out.println("Wrong Answer");
//        } else {
//            boolean correct = true;
//            for (Student student: registeredStudents) {
//                if (student == null) {
//                    correct = false;
//                    System.out.println("Wrong Answer");
//                } else {
//                    String studentId = student.getId();
//                    String studentName = student.getName();
//
//                    if (studentId == null || studentName == null) {
//                        correct = false;
//                        System.out.println("Wrong Answer");
//                    }
//                }
//
//                if (!correct) {
//                    break;
//                }
//            }
//
//            if (correct) {
//                class StudentComparator implements Comparator<Student> {
//                    @Override
//                    public int compare(Student first, Student second) {
//                        int firstStudentNumericId = Integer.parseInt(first.getId().split("-")[2]);
//                        int secondStudentNumericId = Integer.parseInt(second.getId().split("-")[2]);
//
//                        if (firstStudentNumericId == secondStudentNumericId) {
//                            int firstStudentNumericIdPrefix = Integer.parseInt(first.getId().split("-")[1]);
//                            int secondStudentNumericIdPrefix = Integer.parseInt(second.getId().split("-")[1]);
//
//                            return firstStudentNumericIdPrefix - secondStudentNumericIdPrefix;
//                        }
//
//                        return firstStudentNumericId - secondStudentNumericId;
//                    }
//                }
//
//                Collections.sort(registeredStudents, new StudentComparator());
//
//                System.out.println(registeredStudents.size());
//                for (Student student: registeredStudents) {
//                    String studentId = student.getId();
//                    String studentName = student.getName();
//
//                    System.out.println(studentId + " " + studentName);
//                }
//            }
//        }
//    }
//}