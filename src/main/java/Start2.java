import cn.youyinnn.youquickjetty.YouJetty;
import cn.youyinnn.youquickjetty.utils.YouProUtils;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/9/24
 */
public class Start2 {

    public static void main(String[] args) {

        YouJetty youJetty = YouJetty.initServer(args);

        YouProUtils.load("/conf/root.properties");
        System.out.println(YouProUtils.get("root"));

        youJetty.startAndJoin();
    }

}
