//package SOLID;
//
//public class SupportingCase {
//    public static void main(String[] args) {
//
//    }
//}
//
//
//
//interface Software {
//    public String getSoftwareConfig();
//}
//class Kernel implements Hardware {
//    @Override
//    public  String getHardwareConfig() {
//        //methods to retrieve HardWare Configuration
//        return "HardWare";
//    }
//}
////Process management, Memory management, File management, IO management
//class OS  implements Software {
//    String Hardware;
//    @Override
//    public String getSoftwareConfig() {
//        //Returns Software Info "Ubuntu", "Windows", "Arch Linux"
//        return "Ubuntu";
//    }
//    public void interfaceKernelSoftware(){
//        this.Hardware= new Kernel().getHardwareConfig();
//        //.Processing steps to connect kernel and Hardware..
//    }
//}
//class ApplicationSupport extends OS{
//    public String minRequirements(){
//        String software=getSoftwareConfig();
//        interfaceKernelSoftware();
//        // .processing steps....
//        return "Satisfied"; //Sample Return text
//    }
//}
