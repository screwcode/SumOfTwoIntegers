# ScrewCode - SumOfTwoIntegers 

<img align="right" src="https://avatars3.githubusercontent.com/u/45724054">

## 什么是ScrewCode

ScrewCode的名字来源于“面试造火箭，入职拧螺丝”。与其他侧重算法的在线学习平台不同的是，ScrewCode更侧重于提供最真实的工程场景——一旦你能解决ScrewCode中的问题，你就能轻松解决真实工作中的挑战。
ScrewCode利用Travis CI实现了自动判题系统，你可以通过提交Pull Request的方式做题并获得答案是否正确的反馈。你可以通过ScrewCode来学习Git和Github的相关流程，同时，提交Pull Request还能为你的首页点亮小绿点。

## 如何开始

作为最简单的例子，我们来尝试开始提交你的第一个Pull Request并获取反馈！

### 1. 安装Git/JDK/IDEA

下载并安装JDK。你可以选择[JDK8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)或者[JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)。
如果你不清楚二者的区别，那么随便选一个安装就好，对你而言，二者没有任何区别。

下载并安装[IDEA](https://www.jetbrains.com/idea/download/)。Community版即可，土豪随意。

下载并安装[Git](https://git-scm.com/downloads)。

### 2. Fork本项目 

点击本项目首页右上角的`Fork`按钮，稍等。

现在，GitHub应该为你创建了`github.com/<你的GitHub用户名>/SumOfTwoIntegers`。你需要将它Clone到你本地。

### 3. 将Fork的项目Clone到本地

如果你习惯命令行，那么很好，怎么clone这个项目已经无需我废话。你可以跳过此节。

如果你从未使用过Git或者GitHub，那么没关系，跟我来。

打开`https://github.com/<你的GitHub用户名>/SumOfTwoIntegers`。看到页面上那个绿色的`Clone or download`按钮了吗？点击一下，拷贝其中的链接。

除非你知道`SSH`是什么，否则，请确保你拷贝的链接以https开头，如图所示：

重要的事情说三遍，

**一定要点击右上角的`Use HTTPS`然后拷贝以`https`开头的链接！**

**一定要点击右上角的`Use HTTPS`然后拷贝以`https`开头的链接！**

**一定要点击右上角的`Use HTTPS`然后拷贝以`https`开头的链接！**

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/clone-button.png)

接下来，请打开IDEA，在首页上选择`Check out from Version Control`:

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/idea-index.png)

将刚才拷贝的链接粘贴进去。

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/clone.png)

一路选Yes/Next即可。在任何时候，看到弹出窗口，请先仔细阅读一下英文。如果无法理解，请选择"默认按钮"，如Yes/Next等。

如果看到以下窗口，如果你不知道要选择什么，那就按照图中所示选择Maven：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/import.png)

### 4. 切换到题目所在到分支

刚Clone下来的项目一般是默认的`master`分支。如果题目说自己在其他分支上，你可以通过IDEA右下角来切换分支：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/git-branch.png)

### 5. 设置JDK

如果你是第一次使用，IDEA可能会抱怨Project SDK没有设置。这个时候你需要在`File` - `Project Structure`或者`File` - `Project Settings`里面，设置Project SDK为你的JDK安装目录，如图所示：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/set-jdk.png)

### 6. Maven同步

切换到题目所在的分支之后，如果右下角弹出窗口要求你重新导入Maven项目，请选择`Import Changes`：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/reimport-maven.png)

或者你也可以手工点击侧边栏的`Maven`工具栏的同步按钮，如图所示：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/maven-sync.png)

### 7. 开始工作！

一般而言，随后你就可以编辑/运行代码了。你可以尝试在类名上右键，选择`Run`或者`Debug`：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/run-debug.png)

现在你可以在IDEA中开始工作了。

衡量工作是否完成的标志是测试是否通过：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/test-result.png)

（如果看到图中的红色警告，可以无视之）

### 8. 提交代码

在完成工作之后，你需要将代码提交到GitHub。点击IDEA下方的`Version Control`，选中要提交的文件，右键`Commit`。

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/commit-changes.png)

输入提交信息，选择`Commit and Push`。

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/commit-and-push.png)

### 9. 创建新Pull Request

现在回到你的仓库页面，即`https://github.com/<你的GitHub用户名>/SumOfTwoIntegers`，点击`New Pull Request`：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/new-pull-request.png)

在新弹出的页面，选择你的习题所在的分支。例如，你的习题所在的分支名叫`MyProblem`，那么图中的`base`就应该选择`MyProblem`：

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/compare-pr.png)

创建之后，稍等片刻，你会看到Pull Request的结果，通过还是不通过，这是由CI自动判题的。

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/pr-pass.png)

![1](https://raw.githubusercontent.com/screwcode/SumOfTwoIntegers/master/images/pr-fail.png)

如果没有通过，那么很抱歉，请重复上面的`开始工作`和`提交代码`步骤。新提交的代码会自动进入CI，无需重复创建Pull Request。

### 10. 题目通过

如果你的题目通过（CI检查是绿色），它会被自动Merge。恭喜你！`成就达成 - PR Merged`

（在Merge之后你的Commit会被自动revert，以维持仓库的初始状态。如果你看不懂这句话，无视即可。）







