# 第十回課題

・CRUD処理を全てを備えたREST APIを作成する。

・例外発生時のハンドリングを実装する。

# GET処理動作確認

初期テーブル表

| id | name | league | founding_year |
| :---: | :---: | :---: | :---: |
| 1| LiverpoolFC  | PremierLeague | 1892 |
| 2 | FCBarcelona  | LaLiga | 1899 |
| 3| ParisSaint-GermainFC | LIGUE1 | 1932 |
| 4 | InternazionaleMilano | SERIEA | 1898 | 
| 5 | FCBayernMunchen | BUNDESLIGA | 1900 |

http://localhost:8080/teams/1

![スクリーンショット 2023-01-02 20 22 42 2](https://user-images.githubusercontent.com/118739580/218710003-7e797caf-12e3-4b39-8a57-c237a128c87e.jpg)

http://localhost:8080/teams/2

![スクリーンショット 2023-01-02 20 23 22 2](https://user-images.githubusercontent.com/118739580/218709156-01287b5c-50d6-4430-9927-88723fca4f26.jpg)

http://localhost:8080/teams/3

![スクリーンショット 2023-01-02 20 23 51 2](https://user-images.githubusercontent.com/118739580/218710106-80812a75-69f9-452f-9a83-464024c4117a.jpg)

http://localhost:8080/teams/4

![スクリーンショット 2023-01-02 20 24 20 2](https://user-images.githubusercontent.com/118739580/218710158-6f0f49a1-230a-4bc1-80fe-da016851736e.jpg)

http://localhost:8080/teams/5

![スクリーンショット 2023-01-02 20 24 36 2](https://user-images.githubusercontent.com/118739580/218710190-dedc5ec1-239d-40d9-b5f0-ff74463bb3ad.jpg)

http://localhost:8080/teams/99（範囲外アクセス時、指定されたエラーメッセージを返す）

![スクリーンショット 2023-01-02 20 26 16 2](https://user-images.githubusercontent.com/118739580/218710481-68afb1a8-e5f1-438b-b869-75ff437954bc.jpg)

# POST処理動作確認

http://localhost:8080/teams/create（チームを登録し、自動採番されたidを返す）

![スクリーンショット 2023-01-05 15 15 07 2](https://user-images.githubusercontent.com/118739580/218711195-a5655ebd-c5e9-4593-92ad-92b4d7a02b8d.jpg)

name, league, founding_year未入力時エラーメッセージを返す

![スクリーンショット 2023-01-05 15 20 28 2](https://user-images.githubusercontent.com/118739580/218711773-69ec83a6-a156-4757-8376-ece44096573f.jpg)

![スクリーンショット 2023-01-05 15 21 17 2](https://user-images.githubusercontent.com/118739580/218712070-b86c8044-55a1-4ebf-bb80-dd3a4cd47ea5.jpg)

![スクリーンショット 2023-01-05 15 21 34 2](https://user-images.githubusercontent.com/118739580/218712133-54f68f17-8aa2-44a3-b014-49cd793dc31d.jpg)

# PATCH, DELETE処理動作確認

![スクリーンショット 2023-01-09 18 13 38 2](https://user-images.githubusercontent.com/118739580/218712371-b251af0d-64af-4ff0-ab11-12ac913b5631.jpg)

![スクリーンショット 2023-01-09 18 13 15 2](https://user-images.githubusercontent.com/118739580/218712442-233e1b58-195d-48bf-816c-d3d73c244715.jpg)

変更、削除前のテーブル表

![スクリーンショット 2023-01-09 18 10 12 2のコピー](https://user-images.githubusercontent.com/118739580/218712791-41b1d59c-98f3-425d-99e6-689dafa0ec9d.jpg)

変更、削除後のテーブル表

![スクリーンショット 2023-01-09 18 10 58 2](https://user-images.githubusercontent.com/118739580/218712815-14d3377b-c124-4e35-866d-ce3daa921c45.jpg)


# Spring Boot設定

Spring Bootの設定にはspring initializrを使用して設定しました。

| Project| Gradle Project| 
| :---: | :---: | 
| Language | Java | 
| Spring Boot | 3.0.0 | 
| packing | Jar | 
| Java | 17 | 

# PC環境

OS macOS 13.1（22C65）

CPU Apple M1

# 開発環境

IntelliJ IDEA

ランタイムバージョン: 17.0.4.1+7-b469.62 aarch64

# 実行環境

JavaSE-17
