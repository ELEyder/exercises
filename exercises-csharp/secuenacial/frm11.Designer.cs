namespace Ejercicios.secuencial
{
    partial class frm11
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.button1 = new System.Windows.Forms.Button();
            this.txtN2 = new System.Windows.Forms.TextBox();
            this.n = new System.Windows.Forms.Label();
            this.txtN1 = new System.Windows.Forms.TextBox();
            this.a = new System.Windows.Forms.Label();
            this.c = new System.Windows.Forms.Label();
            this.txtN3 = new System.Windows.Forms.TextBox();
            this.d = new System.Windows.Forms.Label();
            this.txtN4 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(97, 177);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 97;
            this.button1.Text = "Calcular";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtN2
            // 
            this.txtN2.Location = new System.Drawing.Point(145, 61);
            this.txtN2.Name = "txtN2";
            this.txtN2.Size = new System.Drawing.Size(100, 20);
            this.txtN2.TabIndex = 95;
            // 
            // n
            // 
            this.n.AutoSize = true;
            this.n.Location = new System.Drawing.Point(21, 64);
            this.n.Name = "n";
            this.n.Size = new System.Drawing.Size(56, 13);
            this.n.TabIndex = 93;
            this.n.Text = "Número 2:";
            // 
            // txtN1
            // 
            this.txtN1.Location = new System.Drawing.Point(145, 23);
            this.txtN1.Name = "txtN1";
            this.txtN1.Size = new System.Drawing.Size(100, 20);
            this.txtN1.TabIndex = 96;
            // 
            // a
            // 
            this.a.AutoSize = true;
            this.a.Location = new System.Drawing.Point(21, 26);
            this.a.Name = "a";
            this.a.Size = new System.Drawing.Size(56, 13);
            this.a.TabIndex = 94;
            this.a.Text = "Número 1:";
            // 
            // c
            // 
            this.c.AutoSize = true;
            this.c.Location = new System.Drawing.Point(21, 104);
            this.c.Name = "c";
            this.c.Size = new System.Drawing.Size(56, 13);
            this.c.TabIndex = 94;
            this.c.Text = "Número 3:";
            // 
            // txtN3
            // 
            this.txtN3.Location = new System.Drawing.Point(145, 101);
            this.txtN3.Name = "txtN3";
            this.txtN3.Size = new System.Drawing.Size(100, 20);
            this.txtN3.TabIndex = 96;
            // 
            // d
            // 
            this.d.AutoSize = true;
            this.d.Location = new System.Drawing.Point(21, 142);
            this.d.Name = "d";
            this.d.Size = new System.Drawing.Size(56, 13);
            this.d.TabIndex = 93;
            this.d.Text = "Número 4:";
            // 
            // txtN4
            // 
            this.txtN4.Location = new System.Drawing.Point(145, 139);
            this.txtN4.Name = "txtN4";
            this.txtN4.Size = new System.Drawing.Size(100, 20);
            this.txtN4.TabIndex = 95;
            // 
            // frm11
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(287, 221);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.txtN4);
            this.Controls.Add(this.txtN2);
            this.Controls.Add(this.d);
            this.Controls.Add(this.n);
            this.Controls.Add(this.txtN3);
            this.Controls.Add(this.c);
            this.Controls.Add(this.txtN1);
            this.Controls.Add(this.a);
            this.Name = "frm11";
            this.Text = "frm11";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox txtN2;
        private System.Windows.Forms.Label n;
        private System.Windows.Forms.TextBox txtN1;
        private System.Windows.Forms.Label a;
        private System.Windows.Forms.Label c;
        private System.Windows.Forms.TextBox txtN3;
        private System.Windows.Forms.Label d;
        private System.Windows.Forms.TextBox txtN4;
    }
}