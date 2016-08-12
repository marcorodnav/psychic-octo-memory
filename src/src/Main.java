/**
 * Created by marcorodnav on 12/08/16.
 */
public class Main {

    public static void main(String[] args) {
        String MESSAGE = "%";
        String binaryMessage = "";
        String binMsj;
        String result;
        for (char c : MESSAGE.toCharArray()) {
            binMsj = Integer.toBinaryString((int)c);
            while(binMsj.length() != 7)
                binMsj = "0" + binMsj;
            binaryMessage += binMsj;
        }
        result = encodeCharacter(binaryMessage.toCharArray());
        System.out.println(result);
    }

    public static String encodeCharacter(char[] binaryCharacters) {
        int posN;
        int pos =0;
        String result = "";
        while (pos < binaryCharacters.length) {
            result += (binaryCharacters[pos] == '1' ? "0 " : "00 ");
            posN = pos;
            while (posN < binaryCharacters.length && binaryCharacters[pos] == binaryCharacters[posN]) {
                result += "0";
                posN++;
            }
            pos = posN;
            if (pos < binaryCharacters.length)
                result += " ";
        }
        return result;
    }
}
