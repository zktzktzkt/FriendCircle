package razerdp.github.com.router;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by 大灯泡 on 2017/4/5.
 * <p>
 * 跳转路由管理
 */

public interface RouterList {

    @Retention(RetentionPolicy.SOURCE)
    @interface PhotoMultiBrowserActivity {
        String path = "/photo/browser";
        String key_browserinfo = "browserinfo";
        String key_maxSelectCount = "maxSelectCount";
        String key_result = "selectedphoto";
        int requestCode = 0x10;
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface PublishActivity {
        String path = "/publish/edit";
        String key_mode = "mode";
        int MODE_TEXT = 0x10;
        int MODE_MULTI = 0x11;
    }

}
