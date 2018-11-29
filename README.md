### 问题：
App本身未调用限制API，但小米MIX 2S Android 9.0系统会调用hiddenapi-dark-greylist，导致在debug模式下会弹出detected problems with API的弹窗

### 具体描述
- 测试步骤：
    - 1.点击进入测试app
    - 2.显示界面后点击界面白色背景，这时候logcat会显示"11-29 10:28:40.421 11237-11237/a.test.aaa W/a.test.aaa: Accessing hidden method Landroid/util/MathUtils;->dist(FFFF)F (dark greylist, linking)"
    - 3.点击power键灭屏
    - 4.再按power键解锁
- 预期结果：正常显示原Hello World!界面
- 实际结果：弹框提示：detected problems with API compatibility(visit g.co/dev/appcompat for more info)
- 发生问题机型：安卓小米mix2s
- 发生问题系统版本：MIUI：8.11.15 开发版 、MIUI 10.0.7.0 稳定版

