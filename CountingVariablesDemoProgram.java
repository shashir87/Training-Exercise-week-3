import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingVariablesDemoProgram {

    public static void main(String[] args) {

        String[] keywordArray = {"String","new","this","protected","public","return","try","static","while","throw","throws","void","for","abstract","new","switch","synchronized","boolean","break","byte","case","catch","char","class","do","if","double","else","extends","final","finally","float","private","implements","import","instanceof","int","short","long","super"};
        String[] operatorArray = {"==","!=","=","+","-","/","%","*","++","--","!",">",">=","<","<=","&&","||","?:","~","<<",">>",">>>","&","^","|"};
        List<String> keywordList= new ArrayList<String>();
        List<String> operatorList= new ArrayList<String>();
        operatorList.addAll(Arrays.asList(operatorArray));
        keywordList.addAll(Arrays.asList(keywordArray));
        String filename="C:\\Users\\User\\Documents\\GitHub\\Training-Exercise-week-3\\Employee.java";
        try {

            BufferedReader in = new BufferedReader(new FileReader(filename));
            StreamTokenizer st = new StreamTokenizer(in);
            boolean eof = false;
            do {
                int token = st.nextToken();
                st.slashSlashComments(true);
                st.slashStarComments(true);
                switch (token) {
                    case StreamTokenizer.TT_EOF:
                        System.out.println("End of File encountered.");
                        eof = true;
                        break;
                    case StreamTokenizer.TT_EOL:
                        System.out.println("End of Line encountered.");
                        break;
                    case StreamTokenizer.TT_WORD:
                        if(keywordList.contains(st.sval)){
                            System.out.println("Keyword is: "+st.sval+" at line number: "+st.lineno());
                        }
                        else{
                            System.out.println("Literals: "+st.sval+" at line number: "+st.lineno());
                        }
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Number is: " + st.nval);
                        break;
                    default:
                        String operator = (char) token+"";
                        if(operatorList.contains(operator)){
                            System.out.println("Operator is: "+operator+" At line number: "+st.lineno());
                        }
                        else System.out.println("Symbol is: "+operator+" At line number: "+st.lineno());
                        if (token == '!') {
                            eof = true;
                        }
                }
            } while (!eof);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
