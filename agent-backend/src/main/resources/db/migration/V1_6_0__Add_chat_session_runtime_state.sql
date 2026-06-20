ALTER TABLE job_agent_chat_session_state
  ADD COLUMN IF NOT EXISTS tool_events_json TEXT;

ALTER TABLE job_agent_chat_session_state
  ADD COLUMN IF NOT EXISTS resume_match_json TEXT;
