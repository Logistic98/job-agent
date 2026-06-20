ALTER TABLE job_agent_chat_message_log
  ADD COLUMN IF NOT EXISTS metadata_json TEXT;
