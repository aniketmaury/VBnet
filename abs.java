Imports System.Data.SqlClient
Imports System.Data

Public Class FrmEmployee
    Dim cn As New SqlConnection("Data Source=.\SQLEXPRESS;AttachDbFilename='C:\Users\Aniket\Documents\Visual Studio 2010\Projects\Aniket1\Aniket1\bin\Debug\Aniket_207.mdf';Integrated Security=True;Connect Timeout=30;User Instance=True")


    Private Sub FrmEmployee_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        cn.Open()
        FillData()
    End Sub

    Private Sub FillData()
        Dim cmd As New SqlCommand
        Dim ds As New DataSet
        Dim da As New SqlDataAdapter
        cmd.CommandText = "Select * from Emp order by eno"
        cmd.Connection = cn
        da.SelectCommand = cmd
        da.Fill(ds)
        DataGridView1.DataSource = ds.Tables(0)
        da.Dispose()
        ds.Dispose()
        cmd.Dispose()
    End Sub
    Private Sub ClearAll()
        txtNo.Clear() : txtMno().Clear()
    End Sub

    Private Sub btnSave_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSave.Click
        Dim query As String
        Dim cmd As New SqlCommand
        query = "insert into emp values(" & Val(txtNo.Text) & ",'" & txtname.Text & "'," & Val(txtMno.Text) & "," & Val(txtsalary.Text) & ")"
        cmd.CommandText = query
        cmd.Connection = cn
        cmd.ExecuteNonQuery()
        MsgBox("Save Successfully")
        cmd.Dispose()
        ClearAll()
        txtNo.Focus()
    End Sub

    Private Sub btnUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnUpdate.Click
        Dim query As String
        Dim cmd As New SqlCommand
        query = "Update  emp set ename='" & txtname.Text & "', txtMno.Text '" & txtMno.Text & "',salary=" & Val(txtsalary.Text) & " Where eno=" & Val(txtNo.Text) & ""
        cmd.CommandText = query
        cmd.Connection = cn
        cmd.ExecuteNonQuery()
        MsgBox("Update Successfully")
        cmd.Dispose()
        ClearAll()
        txtNo.Focus()
    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        Dim query As String
        Dim cmd As New SqlCommand
        If MsgBox("Do you want  to delete ?", vbYesNo + vbQuestion + vbDefaultButton2) = vbNo Then
            Exit Sub
        End If

        query = "delete from emp where eno=" & Val(txtNo.Text) & " "
        cmd.CommandText = query
        cmd.Connection = cn
        cmd.ExecuteNonQuery()
        MsgBox("Save Successfully")
        cmd.Dispose()
        ClearAll()
        txtNo.Focus()
    End Sub

    Private Sub btnget_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnget.Click
        Dim cmd As New SqlCommand
        Dim dr As SqlDataReader
        cmd.CommandText = "select* from emp where eno=" & Val(txtNo.Text) & ""
        cmd.Connection = cn
        dr = cmd.ExecuteReader
        If dr.HasRows = True Then
            dr.Read()
            txtname.Text = dr.Item("Ename").ToString
            txtMno.Text = dr.Item("Moblileno").ToString

            txtsalary.Text = dr.Item("Salry").toString
        Else
            ClearAll()
            MsgBox("No date Found")
        End If
        If dr.IsClosed = False Then dr.Close()
        cmd.Dispose()
    End Sub

    Private Sub txtfind_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtfind.TextChanged
        Dim cmd As New SqlCommand
        Dim ds As New DataSet
        Dim da As New SqlDataAdapter
        If txtfind.Text = "" Then
            cmd.CommandText = "select  * from emp order by eno"
        Else
            If rbname.Checked = True Then
                cmd.CommandText = "select * from emp where ename like'" & txtfind.Text & "%'"
            Else
                cmd.CommandText = "select *from emp where mobileno like'" & txtfind.Text & "%'"
            End If
        End If
        cmd.Connection = cn
        da.SelectCommand = cmd
        da.Fill(ds)
        DataGridView1.DataSource = ds.Tables(0)
        da.Dispose()

    End Sub
End Class
