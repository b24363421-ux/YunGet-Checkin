pluginManagement {
    repositories {
        // Use canonical repositories first. A mirror can publish partial metadata
        // and prevent Gradle from resolving the plugin artifact in later repos.
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TurboDL SDK 以 dev.turbodl:*:0.1.0 发布在本地 Maven（~/.m2），优先解析
        mavenLocal()
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        google()
        mavenCentral()
    }
}

rootProject.name = "YunGet"

include(":app")

// 纯 JVM 的共享内核（网盘解析/模型/任务模型）：Android 与桌面/Flutter 的引擎宿主共用。
include(":core")

// 桌面端的引擎宿主（TurboDL + core，stdio JSON 协议）。
include(":host")

// Independent Android app; does not replace YunGet.
include(":quarkfinder")

// 手机端的插件只有 JS（L1）一种形态，因此没有独立的插件打包模块 —— 原生（L2）插件的
// 打包模块 :l2-providers 与整套 dex 加载机制已随「原生插件在手机端暂时禁用」一并移除
// （后续在 Windows 端启用原生插件）。
