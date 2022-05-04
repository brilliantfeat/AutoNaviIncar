# AutoNaviIncar

![](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/threadResource/20220501/eaa0319625c2433a8c5b66f1edc15359_w256_h256.png)

高德地图车机版incar小窗版

支持incar小窗

`支持功能:`

1.小窗

![](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/threadResource/20220501/631d45dcd7db4c3b8a9aeca59477e65e_w960_h540.gif_.webp)

2.快捷按钮导航

![](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/threadResource/20220501/41671421a24e4dea85ea31c4110e3392_w960_h540.gif_.webp)

3.语音控制

![](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/threadResource/20220501/7b26ad59b6ba475699b9c82316f40658_w960_h540.gif_.webp)

![](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/threadResource/20220501/fdd84afd24fc4d669e6f8fd7c1cedeca_w960_h540.gif_.webp)

![](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/threadResource/20220501/f2a97cb6f0624643ae4a367187bc5d13_w960_h540.gif_.webp)

`存在问题:`

1.~~不支持主页快捷键快速导航;~~
**20220322已支持**

2.~~不支持语音;~~
**20220322支持设置目的地，不支持途径点**

**20220331支持退出导航语音指令**

3.~~不支持点击小窗打开应用~~（**20220326更新支持**）

等其它可能存在问题

******************************************************************

`最新更新重要提示：`

Tip：该软件为官方未经授权修改软件，仅个人试用体验，任何个人及团体下载本软件后不得用于商业用途及其它用途，软件版权归高德地图公司所有。20220331版基于高德地图车机版V6.1.0beta版修改，因修改并添加部分代码，可能会产生一些意料之外的bug，请理性对待。

感谢软件修改过程中给予技术支持帮助的各位工程师，谢谢！

目前jovi incar地图导航基本功能均已实现，之后可能仅会跟随官方正式版本更新。

+ 20220428更新：
1.底包更新为官方v6.1.0正式版。

+ 20220422 更新：
1.底包更新为官方v6.1.0.600317众测版；
2.修改巡航状态下显示ui层（显示车速）；
提示：经测试发现使用中偶现切换屏幕切到小屏时画面重叠及闪屏问题，目前暂未找到解决办法。可保持手机亮屏使用，即开发者选项打开手机充电屏幕常亮，这样问题出现概率极低。
出野外了，暂停更新，有兴趣的同学自行研究吧！

+ 20220413 更新1.修改TargetSDKVersion为30，首次安装打开会有更新地图提示，请点击进入地图，建议首次打开在手机端操作。
2.修改非导航时小窗显示图层顺序（需要安卓11及以上）；
Tip：为防止恶意修MT公共签名改为个人签名，因此不可直接升级，需要卸载之前版本再安装；如需在此基础二次修改请说明出处。因安卓11隐私设置，在sd卡目录存储内容需单独申请权限，百度uri接收的log路径更改为sdcard/android/data/com.baidu.BaiduMap/files/Brilliant/log.txt，如需查看或反馈请到该目录下查看。
该版本开始将使用个人签名及TargetSDKVersion=30。

+ 20220402更新1.升级底包为官方6.1.0 beta 180版（2022.3.31更新），官方论坛反应该版本导航图面较混乱，建议按需升级；
2.修复小卡片在巡航仍然显示错误导航信息的问题；
3.增加导航过程语音增加全览（仅导航中有效），目前无法语音关闭，据说百度地图也没法关闭。导航时唤醒jovi说“打开全览”或“全览”；
4.增加语音调整图面大小，任何时候唤醒jovi说“放大地图或“缩小地图”；
5.增加语音关闭路况显示，任何时候唤醒jovi说“关闭路况”，目前无法语音开启，据说百度地图也没法开启。
6.增加百度uri的日志记录，如遇语音控制确定incar已发送指令单高德只是打开软件而无其它反应时到内部sd卡根目录/Brilliant文件夹下拷贝log发起issue（指令”打开巡航“、”关闭巡航“除外，暂不支持）。

+ 20220331更新添加退出导航语音指令支持，修改导航卡片”左前“、”右前“两个错误的图标

+ 20220330添加代码较多，添加的功能也多，如导航信息小卡片，导航隐藏小窗界面快捷导航按钮等，同时也可能存在不可预知错误。 

+ 20220326更新支持点击小窗无论点哪里，只要在应用范围内都会转到主应用，如不需要该功能自行删除。+

*****************************************************************

已上传部分修改代码，如需其他更改，请自行修改。

[下载地址](https://github.com/brilliantfeat/AutoNaviIncar/releases)

许多网友反应无法下载，上传了[百度网盘](https://pan.baidu.com/s/1bfIHyDcrJIrJ5g-_Lg8nBg),提取码：8888

安装教程：

[点击观看视频](https://community-static.vivo.com.cn/wiwNWYCFW9ieGbWq/video/20220504/641b1d8ce895430295c6189da3da0d1a.mp4)

`说明:为占用百度地图包名版本,所以手机中如果有百度地图请先卸载再安装;`

~~仅替换包名及activity添加incar小窗支持,未做其它任何修改,~~`添加少量必要代码.`

`介意勿下。。。`
__纯属自娱自乐，使用中如遇任何问题或因此软件遭受任何损失与本人、高德及vivo无关，请按需下载使用__
