import org.json.simple.JSONObject;
import sg.dex.starfish.dexchain.DexResolver;
import sg.dex.starfish.util.DID;

public class ResolverOperation {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        //DID did = DID.parse(args[0].toString());
        DID did = DID.createRandom();
        DexResolver default_resolver = (DexResolver) DexResolver.create();
        String ddoString = default_resolver.getDDOString(did);
        JSONObject ddo = new JSONObject();
        ddo.put("ddo", ddoString);
        System.out.println(ddoString);
        System.exit(1);
    }
}