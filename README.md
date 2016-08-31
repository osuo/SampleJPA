# SampleJPA

ハンズオン用のネタです。

## 動作準備

### 使うもの

* エディタ ... なんでも。メモ帳でも。
* JDK ... JREでなく。JDK。1.8でやってます。
* Gradle ... version 3.0でやってます。
* H2 ...  サーバーモードで起動しておく。
* ネットワーク接続 ... 依存するJarをダウンロードしますので。

## 動かし方

1. H2起動しておく

url: jdbc:h2:tcp://localhost/~/sampledb

2. テーブル作る

data/USER.sql　を　使ってください。

3. 実行する！

コンソールやコマンドプロンプトなどでやる。

$ gradle bootRun

コンパイルして、起動する。Applicationクラスのrunメソッドの中身が動く。

