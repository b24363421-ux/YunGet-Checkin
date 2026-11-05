# QuarkFinder

獨立 Android TV / Android 手機夸克網盤資源搜尋 App，與根目錄 YunGet App 分離。

## 功能
- 透過盤搜索公開 API 搜尋夸克索引（無需註冊）
- 熱門 / 最新 / 容量 / 年份排序
- 電影、劇集、動漫、書籍、軟體、課程、音樂分類
- 4K / 1080P / 720P 與收錄時間篩選
- 開啟分享頁、複製連結與提取碼
- 批次貼上分享連結並整理
- TV 遙控器方向鍵與焦點操作

## 連結有效性
分享連結由第三方提供，無法在跨網域環境下可靠地僅靠 HTTP 狀態碼判斷是否仍可播放。App 不會把 HTTP 200 當成有效；第一版提供直接開啟分享頁及人工確認標記。

## Build
在 repo 根目錄執行：
`./gradlew :quarkfinder:assembleDebug`

APK：`quarkfinder/build/outputs/apk/debug/quarkfinder-debug.apk`

API 文件：https://www.pansousuo.com/api-docs
