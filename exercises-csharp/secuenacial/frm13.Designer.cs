namespace Ejercicios.secuencial
{
    partial class frm13
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
            this.txtN3 = new System.Windows.Forms.TextBox();
            this.c = new System.Windows.Forms.Label();
            this.txtN1 = new System.Windows.Forms.TextBox();
            this.a = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(103, 153);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 117;
            this.button1.Text = "Calcular";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtN2
            // 
            this.txtN2.Location = new System.Drawing.Point(156, 65);
            this.txtN2.Name = "txtN2";
            this.txtN2.Size = new System.Drawing.Size(100, 20);
            this.txtN2.TabIndex = 114;
            // 
            // n
            // 
            this.n.AutoSize = true;
            this.n.Location = new System.Drawing.Point(32, 68);
            this.n.Name = "n";
            this.n.Size = new System.Drawing.Size(56, 13);
            this.n.TabIndex = 109;
            this.n.Text = "Número 2:";
            // 
            // txtN3
            // 
            this.txtN3.Location = new System.Drawing.Point(156, 105);
            this.txtN3.Name = "txtN3";
            this.txtN3.Size = new System.Drawing.Size(100, 20);
            this.txtN3.TabIndex = 115;
            // 
            // c
            // 
            this.c.AutoSize = true;
            this.c.Location = new System.Drawing.Point(32, 108);
            this.c.Name = "c";
            this.c.Size = new System.Drawing.Size(56, 13);
            this.c.TabIndex = 110;
            this.c.Text = "Número 3:";
            // 
            // txtN1
            // 
            this.txtN1.Location = new System.Drawing.Point(156, 27);
            this.txtN1.Name = "txtN1";
            this.txtN1.Size = new System.Drawing.Size(100, 20);
            this.txtN1.TabIndex = 116;
            // 
            // a
            // 
            this.a.AutoSize = true;
            this.a.Location = new System.Drawing.Point(32, 30);
            this.a.Name = "a";
            this.a.Size = new System.Drawing.Size(56, 13);
            this.a.TabIndex = 111;
            this.a.Text = "Número 1:";
            // 
            // frm13
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(312, 190);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.txtN2);
            this.Controls.Add(this.n);
            this.Controls.Add(this.txtN3);
            this.Controls.Add(this.c);
            this.Controls.Add(this.txtN1);
            this.Controls.Add(this.a);
            this.Name = "frm13";
            this.Text = "frm13";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox txtN2;
        private System.Windows.Forms.Label n;
        private System.Windows.Forms.TextBox ;
        private System.Windows.Forms.Label c;
        private System.Windows.Forms.TextBox txtN1;
        private System.Windows.Forms.Label a;
    }
}