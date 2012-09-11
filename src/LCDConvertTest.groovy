
/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/9/12
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
class LCDConvertTest extends GroovyTestCase {
    LCDConvert lcdConvert

    void setUp()
    {
        lcdConvert = new LCDConvert()
    }

    void testDisplay0() {
        String result = lcdConvert.convert("0")
        assert result == " -  \n" +
                "| | \n" +
                "    \n" +
                "| | \n" +
                " -  \n";
    }

    void testDisplay1() {
        String result = lcdConvert.convert("1")
        assert result == "    \n" +
                "  | \n" +
                "    \n" +
                "  | \n" +
                "    \n";

    }

    void testDisplay2() {
        String result = lcdConvert.convert("2")
        assert result == " -  \n" +
                "  | \n" +
                " -  \n" +
                "|   \n" +
                " -  \n";
    }

    void testDisplay3(){
        String result = lcdConvert.convert("3")
        assert  result == " -  \n"+
                "  | \n"+
                " -  \n"+
                "  | \n"+
                " -  \n";
    }

}