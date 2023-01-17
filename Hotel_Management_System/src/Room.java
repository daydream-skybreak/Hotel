import java.util.ArrayList;
public class Room {
    enum RoomType {
        PresidentialSuite, Luxury, VIP, Standard
    }
//    Room(){
//        if (pRoom.isEmpty()){
//            int pStart = 400, lStart= 300, vStart = 200, sStart = 100;
//            for (int i = 1;i <= 5; i++){
//                pRoom.add(pStart + i);
//                lRoom.add(lStart + i);
//                vRoom.add(vStart + i);
//                sRoom.add(sStart + i);
//            }
//            for (int i = 6;i <= 10; i++){
//                lRoom.add(lStart + i);
//                vRoom.add(vStart + i);
//                sRoom.add(sStart + i);
//            }
//            for (int i = 11;i <= 25; i++){
//                vRoom.add(vStart + i);
//                sRoom.add(sStart + i);
//            }
//            for (int i = 26;i <= 50; i++){
//                vRoom.add(vStart + i);
//                sRoom.add(sStart + i);
//            }
//        }
//    }
    static ArrayList<Integer> pRoom = new ArrayList<>();
    static ArrayList<Integer> lRoom = new ArrayList<>();
    static ArrayList<Integer> vRoom = new ArrayList<>();
    static ArrayList<Integer> sRoom = new ArrayList<>();



}
