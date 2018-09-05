public class Replace 
{
    public static void main(String[] args)
    {
        String original = "HYXUDGTGPAFPOFDOFNFBGDDSXIFIUBGXFNFBGDDSXBSDOFBPGXFNFBGDDSXJGTTSNXJUOAPSYDIXJFHPGZFWFDTUZUDAGDIIFGINJSOXPYAATFIJFPFJGZFBSDOFBPGXFIUXVGPGHSZFSYPRSSPRSNFPXSGIISPIFXPGBXXJFNSPTINUTTTUXXTFDSXFDSPTSDAPFWFWHFPNJGXNFOGKJFPFHYXUXBGDDFZFPVSPAFXNJGXXJFKIUIJFPFUXUOVSPYOXJFTUZUDAPGXJFPXSHFIFIUBGXFIJFPFXSXJFYDVUDUOJFINSPCNJUBJXJFKNJSVSYAJXJFPFJGZFXJYOVGPOSDSHTKGIZGDBFIUXUOPGXJFPVSPYOXSHFJFPFIFIUBGXFIXSXJFAPFGXXGOCPFWGUDUDAHFVSPFYOXJGXVPSWXJFOFJSDSPFIIFGINFXGCFUDBPFGOFIIFZSXUSDXSXJGXBGYOFVSPNJUBJXJFKAGZFXJFTGOXVYTTWFGOYPFSVIFZSXUSDXJGXNFJFPFJUAJTKPFOSTZFXJGXXJFOFIFGIOJGTTDSXJGZFIUFIUDZGUDXJGXXJUODGXUSDYDIFPASIOJGTTJGZFGDFNHUPXJSVVPFFISWGDIXJGXASZFPDWFDXSVXJFRFSRTFHKXJFRFSRTFVSPXJFRFSRTFOJGTTDSXRFPUOJVPSWXJFFGPXJGHPGJGWTUDBSTDDSZFWHFP";
        
        String newString = original.replaceAll("X", "t");
        newString = newString.replaceAll("J", "h");
        newString = newString.replaceAll("F", "e");
        newString = newString.replaceAll("G", "a");
         newString = newString.replaceAll("O", "s");
          newString = newString.replaceAll("S", "o");
         newString = newString.replaceAll("I", "d");
          newString = newString.replaceAll("P", "r");
          newString = newString.replaceAll("H", "b");
          newString = newString.replaceAll("C","k");
          newString = newString.replaceAll("T", "l");
          newString = newString.replaceAll("V", "f");
          newString = newString.replaceAll("Z", "v");
          newString = newString.replaceAll("R", "p");
          newString = newString.replaceAll("D", "n");
          newString = newString.replaceAll("W", "m");
          newString = newString.replaceAll("U", "i");
          newString = newString.replaceAll("B", "c");
          newString = newString.replaceAll("K", "y");
          newString = newString.replaceAll("A", "g");
          newString = newString.replaceAll("N","w");
            newString = newString.replaceAll("Y","u");
        System.out.print(newString);
    }
}