## Readnet.java

**處裡內容**

接收 Server 端發送的資料，並輸出至螢幕

**結束條件**  

網路資料讀取完畢

**輸入設備**

網路（Address,Port）

**輸出設備**

螢幕

## Netclock.java


**處裡內容**

設置 Server Port Number（6000），等待Client連線請求

**結束條件**  

`Ctrl + c`

**輸入設備**

無

**輸出設備**

網路

## 使用方式

**windows**

Setp 1：開啟兩個命令提示字元（CMD）  
Setp 2：一個執行 java Netclock  
Setp 3：一個執行 java Readnet localhost 6000

**Ubuntu**

Setp 1：執行 Netclock.java  
```bash  
  docker@Docker:~/JAVA$ sudo java Netclock & #背景執行  
```
Setp 2：執行 Readnet.java 
```bash
  docker@Docker:~/JAVA$ sudo java Readnet localhost 6000
```

如何關閉 Netclock.java

```bash
 docker@Docker:~/JAVA$ ps -aux | grep java
 docker@Docker:~/JAVA$ sudo kill (PID編號)
 docker@Docker:~/JAVA$ jobs # 查看背景執行
```
 


