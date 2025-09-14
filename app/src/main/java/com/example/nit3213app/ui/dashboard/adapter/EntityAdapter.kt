package com.example.nit3213app.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nit3213app.data.api.models.Entity
import com.example.nit3213app.databinding.ItemEntityBinding

class EntityAdapter(
    private val onItemClick: (Entity) -> Unit
) : ListAdapter<Entity, EntityAdapter.EntityViewHolder>(EntityDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntityViewHolder {
        val binding = ItemEntityBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return EntityViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: EntityViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class EntityViewHolder(
        private val binding: ItemEntityBinding,
        private val onItemClick: (Entity) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(entity: Entity) {
            binding.entity = entity
            binding.root.setOnClickListener { onItemClick(entity) }
            binding.executePendingBindings()
        }
    }

    class EntityDiffCallback : DiffUtil.ItemCallback<Entity>() {
        override fun areItemsTheSame(oldItem: Entity, newItem: Entity): Boolean {
            // Assuming `name` uniquely identifies an entity
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Entity, newItem: Entity): Boolean {
            // Leverage data class equals() to compare fields
            return oldItem == newItem
        }
    }
}