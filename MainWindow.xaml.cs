using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Text;
using System.Windows;
using System.Windows.Forms;

namespace Excel2Lua
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void ButtonExcelPath_OnClick(object sender, RoutedEventArgs e)
        {
            FolderBrowserDialog dilog = new FolderBrowserDialog();
            dilog.Description = "请选择目录";
            var result = dilog.ShowDialog();
            if (result == System.Windows.Forms.DialogResult.Yes || result == System.Windows.Forms.DialogResult.OK)
            {
                this.ExcelPath.Content = dilog.SelectedPath;
            }

            RefleshFiles();
        }

        private void ButtonBranch_OnClick(object sender, RoutedEventArgs e)
        {
            var path = this.ExcelPath.Content as string;
            if (string.IsNullOrEmpty(path))
            {
                this.ResultMsg.Text = "请先选择Excel目录";
                return;
            }

//            Process CmdProcess = new Process();
//            CmdProcess.StartInfo.FileName = "git";
//            CmdProcess.StartInfo.CreateNoWindow = true;         // 不创建新窗口    
//            CmdProcess.StartInfo.WorkingDirectory = path;
//            CmdProcess.StartInfo.UseShellExecute = false;
//            CmdProcess.StartInfo.RedirectStandardOutput = true;
//            CmdProcess.StartInfo.RedirectStandardError = true;
//
//            CmdProcess.StartInfo.Arguments = "status .";//“/C”表示执行完命令后马上退出  
//            CmdProcess.Start();//执行  
//
//            string result = CmdProcess.StandardOutput.ReadToEnd();//获取返回值  
//            Console.Out.WriteLine(result);
//
//            CmdProcess.WaitForExit();//等待程序执行完退出进程  
//
//            CmdProcess.Close();//结束
            this.allbranch.ItemsSource = new List<string> {"none"};
            this.ResultMsg.Text = "尚未实现";
            RefleshFiles();
        }
        
        private void RefleshFiles()
        {
            var path = this.ExcelPath.Content as string;
            StringBuilder sb = new StringBuilder();
            sb.AppendLine(path);
            var files = Directory.GetFiles(path, "*.xlsx");
            foreach (var file in files)
            {
                sb.AppendLine(file);
            }

            this.ResultMsg.Text = sb.ToString();
            this.AllFiles.ItemsSource = files;
        }
    }
}