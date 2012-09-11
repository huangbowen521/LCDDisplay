public class LCDConvert
{
    static lcdCodes = [[" - ", "| |", "   ", "| |", " - "],
            ["   ", "  |", "   ", "  |", "   "],
            [" - ", "  |", " - ", "|  ", " - "],
            [" - ", "  |", " - ", "  |", " - "],
            ["   ", "| |", " - ", "  |", "   "],
            [" - ", "|  ", " - ", "  |", " - "],
            [" - ", "|  ", " - ", "| |", " - "],
            [" - ", "  |", "   ", "  |", "   "],
            [" - ", "| |", " - ", "| |", " - "],
            [" - ", "| |", " - ", "  |", " - "]]

    def convert(number, size = 1)
    {
        def printStr = ""
        for(i in 0..4)
        {    def line = ""
            for(c in 0..<number.size())
            {
                line += lcdCodes[number[c].toInteger()][i][0]
                (1..size).each {  line += lcdCodes[number[c].toInteger()][i][1] }
                line += lcdCodes[number[c].toInteger()][i][2] + " "
            }
            line += "\n"
            if (i == 1 || i == 3)
            {
                (1..size).each{ printStr += line}
            }
            else
            {
                printStr += line
            }
        }
        return  printStr
    }
}