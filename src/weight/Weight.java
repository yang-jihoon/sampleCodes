package weight;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;


final public class Weight {

 

    private Weight() {
    }

 

    public static int getWeight(Object object)  {

 

        int ret = -1;

 

        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;

 

        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            oos.flush();
            baos.flush();
            ret = baos.toByteArray().length;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                }
            }

            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                }
            }
        }

        
        return ret;
    }
    
    public static void main(String[] args) {
        BigInteger e = new BigInteger("1211");

        System.out.println(Weight.getWeight(e) + " bytes");
    }


}

