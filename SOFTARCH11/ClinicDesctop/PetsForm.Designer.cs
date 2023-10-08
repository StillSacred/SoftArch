namespace ClinicDesctop
{
    partial class PetsForm
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
            listViewPets = new ListView();
            columnHeaderId = new ColumnHeader();
            columnHeaderClientId = new ColumnHeader();
            columnHeaderPetName = new ColumnHeader();
            columnHeaderBirthday = new ColumnHeader();
            btnUpdatePets = new Button();
            SuspendLayout();
            // 
            // listViewPets
            // 
            listViewPets.Columns.AddRange(new ColumnHeader[] { columnHeaderId, columnHeaderClientId, columnHeaderPetName, columnHeaderBirthday });
            listViewPets.FullRowSelect = true;
            listViewPets.GridLines = true;
            listViewPets.Location = new Point(0, 1);
            listViewPets.Name = "listViewPets";
            listViewPets.Size = new Size(798, 368);
            listViewPets.TabIndex = 0;
            listViewPets.UseCompatibleStateImageBehavior = false;
            listViewPets.View = View.Details;
            // 
            // columnHeaderId
            // 
            columnHeaderId.Text = "#";
            columnHeaderId.Width = 50;
            // 
            // columnHeaderClientId
            // 
            columnHeaderClientId.Text = "ID Клиента";
            columnHeaderClientId.Width = 200;
            // 
            // columnHeaderPetName
            // 
            columnHeaderPetName.Text = "Имя питомца";
            columnHeaderPetName.Width = 200;
            // 
            // columnHeaderBirthday
            // 
            columnHeaderBirthday.Text = "День рождения";
            columnHeaderBirthday.Width = 200;
            // 
            // btnUpdatePets
            // 
            btnUpdatePets.Location = new Point(653, 386);
            btnUpdatePets.Name = "btnUpdatePets";
            btnUpdatePets.Size = new Size(120, 52);
            btnUpdatePets.TabIndex = 3;
            btnUpdatePets.Text = "Обновить список питомцев";
            btnUpdatePets.UseVisualStyleBackColor = true;
            btnUpdatePets.Click += btnUpdatePets_click;
            // 
            // PetsForm
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(btnUpdatePets);
            Controls.Add(listViewPets);
            Name = "PetsForm";
            Text = "Питомцы";
            ResumeLayout(false);
        }

        #endregion

        private ListView listViewPets;
        private ColumnHeader columnHeaderId;
        private ColumnHeader columnHeaderClientId;
        private ColumnHeader columnHeaderPetName;
        private ColumnHeader columnHeaderBirthday;
        private Button btnUpdatePets;
    }
}