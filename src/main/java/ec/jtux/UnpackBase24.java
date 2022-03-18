package ec.jtux;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.packager.BASE24Packager;

public class UnpackBase24
{
    public static void main( String[] args )
    {
        String hexmsg = args[0];
        byte[] bmsg =ISOUtil.hex2byte(hexmsg,ISOUtil.CHARSET);
        ISOMsg m = new ISOMsg();
        BASE24Packager p = new BASE24Packager();
        m.setPackager(p);
        try {
            m.unpack(bmsg);
            m.dump(System.out, "");
        } catch (ISOException e) {
            System.err.println(e.getMessage());
        }
        System.exit(0);
    }
}
