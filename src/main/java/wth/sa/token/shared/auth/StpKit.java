package wth.sa.token.shared.auth;

import cn.dev33.satoken.stp.StpLogic;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.stereotype.Component;

/**
 * StpLogic 门面类，管理项目中所有的 StpLogic 账号体系
 * 添加 @Component 注解的目的是确保静态属性 DEFAULT 和 SPACE 被初始化
 */
@Component
public class StpKit {

    public static final String SPACE_TYPE = "space";

    /**
     * 默认原生会话对象，项目中目前没使用到
     */
    public static final StpLogic DEFAULT = StpUtil.stpLogic;

   /**
   * 下面是解释
   */
    private StpKit() {
        // 这里相当于两个不同的会话体系:
        // 1. 默认原生会话对象
        // 2. Space 会话对象
        StpUtil.getTokenInfo();
        SPACE.getTokenInfo();
        // StpUtil就是上面的loginType，这里就是默认的loginType
        StpLogic stpLogic = StpUtil.stpLogic;

    }
    /**
     * Space 会话对象，管理 Space 表所有账号的登录、权限认证
     */
    public static final StpLogic SPACE = new StpLogic(SPACE_TYPE);
}