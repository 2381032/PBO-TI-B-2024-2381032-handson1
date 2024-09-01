public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        //Widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        //Narowing
        int tipeDataInteger = 130;
        byte tipeDataByte2 = (byte) tipeDataInteger;
        System.out.println(tipeDataByte2);
    }
}
