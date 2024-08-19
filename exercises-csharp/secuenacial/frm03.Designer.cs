namespace Ejercicios.secuencial
{
    partial class frm03
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
            this.txtR2 = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtR1 = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtT2 = new System.Windows.Forms.TextBox();
            this.txtT3 = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.txtT1 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(100, 213);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 31;
            this.button1.Text = "Calcular";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtR2
            // 
            this.txtR2.Location = new System.Drawing.Point(145, 187);
            this.txtR2.Name = "txtR2";
            this.txtR2.Size = new System.Drawing.Size(100, 20);
            this.txtR2.TabIndex = 26;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(36, 190);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(82, 13);
            this.label5.TabIndex = 21;
            this.label5.Text = "Total en Yardas";
            // 
            // txtR1
            // 
            this.txtR1.Location = new System.Drawing.Point(145, 145);
            this.txtR1.Name = "txtR1";
            this.txtR1.Size = new System.Drawing.Size(100, 20);
            this.txtR1.TabIndex = 27;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(36, 148);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(84, 13);
            this.label4.TabIndex = 22;
            this.label4.Text = "Total en Metros:";
            // 
            // txtT2
            // 
            this.txtT2.Location = new System.Drawing.Point(145, 68);
            this.txtT2.Name = "txtT2";
            this.txtT2.Size = new System.Drawing.Size(100, 20);
            this.txtT2.TabIndex = 28;
            // 
            // txtT3
            // 
            this.txtT3.Location = new System.Drawing.Point(145, 107);
            this.txtT3.Name = "txtT3";
            this.txtT3.Size = new System.Drawing.Size(100, 20);
            this.txtT3.TabIndex = 29;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(36, 71);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(92, 13);
            this.label2.TabIndex = 23;
            this.label2.Text = "Tramo 2 (en pies):";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(36, 110);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(98, 13);
            this.label3.TabIndex = 24;
            this.label3.Text = "Tramo 3 (en millas):";
            // 
            // txtT1
            // 
            this.txtT1.Location = new System.Drawing.Point(145, 30);
            this.txtT1.Name = "txtT1";
            this.txtT1.Size = new System.Drawing.Size(100, 20);
            this.txtT1.TabIndex = 30;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(36, 33);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(88, 13);
            this.label1.TabIndex = 25;
            this.label1.Text = "Tramo 1 (en Km):";
            // 
            // frm03
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(281, 251);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.txtR2);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.txtR1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtT2);
            this.Controls.Add(this.txtT3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtT1);
            this.Controls.Add(this.label1);
            this.Name = "frm03";
            this.Text = "frm03";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox txtR2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtR1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtT2;
        private System.Windows.Forms.TextBox txtT3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtT1;
        private System.Windows.Forms.Label label1;
    }
}