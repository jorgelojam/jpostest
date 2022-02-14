package ec.jtux;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.header.BASE1Header;
import org.jpos.iso.packager.Base1Packager;

public class UnpackBase1 
{
    public static void main( String[] args )
    {
        String hmessage = args[0];
        byte[] hmsg = ISOUtil.hex2byte(hmessage,ISOUtil.CHARSET);
        BASE1Header header = new BASE1Header();
        header.unpack(hmsg);
        System.out.println(header.formatHeader());
        String hexmsg = args[1];
        byte[] bmsg =ISOUtil.hex2byte(hexmsg,ISOUtil.CHARSET);
        ISOMsg m = new ISOMsg();
        Base1Packager p = new Base1Packager();
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
